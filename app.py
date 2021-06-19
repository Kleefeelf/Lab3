from flask import Flask, request, jsonify
from flask_sqlalchemy import SQLAlchemy
from flask_marshmallow import Marshmallow
import os

app = Flask(__name__)
basedir = os.path.abspath(os.path.dirname(__file__))
app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+mysqlconnector://root:sugoi@localhost:3306/lab6'
db = SQLAlchemy(app)
ma = Marshmallow(app)


class Glass(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(80), unique=False)
    brand = db.Column(db.String(120), unique=False)

    def __init__(self, name, brand):
        self.name = name
        self.brand = brand
    
    def serialize(self):
        return {
            "glass name": self.name,
            "brand": self.brand
        }


class GlassSchema(ma.Schema):
    class Meta:
        fields = ('name', 'brand')


glass_schema = GlassSchema()
glasses_schema = GlassSchema(many=True)


# endpoint to create new glass
@app.route("/glass", methods=["POST"])
def add_glass():
    name = request.json['name']
    brand = request.json['brand']
    
    new_glass = Glass(name, brand)

    db.session.add(new_glass)
    db.session.commit()

    return jsonify(new_glass.serialize())


# endpoint to show all users
@app.route("/glasses", methods=["GET"])
def get_glass():
    all_glasses = Glass.query.all()
    result = glasses_schema.dump(all_glasses)
    return jsonify(result)


# endpoint to get glass detail by id
@app.route("/glass/<id>", methods=["GET"])
def glass_detail(id):
    glass = Glass.query.get(id)
    return glass_schema.jsonify(glass)


# endpoint to update glass
@app.route("/glass/<id>", methods=["PUT"])
def glass_update(id):
    glass = Glass.query.get(id)
    glass.name = request.json['name']
    glass.brand = request.json['brand']

    db.session.commit()
    return glass_schema.jsonify(glass)


# endpoint to delete glass
@app.route("/glass/<id>", methods=["DELETE"])
def glass_delete(id):
    glass = Glass.query.get(id)
    db.session.delete(glass)
    db.session.commit()

    return glass_schema.jsonify(glass)


if __name__ == '__main__':
    app.run(debug=True)