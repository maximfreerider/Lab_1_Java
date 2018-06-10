from app import app
from flask import request
from app import db
from equipment import Equipment


from app import ma


class EquipmentStructure(ma.Schema):
    class Meta:
        fields = ('id', 'type', 'weight', 'produce_name', 'amort')


@app.route('/')
def index():
    return '<h1> Hello! </h1>'


@app.route('/equipment/<id>', methods=['GET'])
def get_equipment(id):
    equipment = Equipment.query.get(id) #take id from main class
    if equipment is not None:
        return equipment.__str__()
    else:
        return "Equipment not exist"


@app.route('/equipment', methods=['POST'])
def add_equipment():
    id = request.json['id']
    type = request.json['type']
    produce_name = request.json['produce_name']
    weight = request.json['weight']
    amort = request.json['amort']

    new_equipment = Equipment()
    new_equipment.id = id
    new_equipment.type = type
    new_equipment.produce_name = produce_name
    new_equipment.weight = weight
    new_equipment.amort = amort

    db.session.add(new_equipment)  # adding to DB elements
    db.session.commit() # have to write with session.add

    return str(new_equipment.__str__())


@app.route('/equipment/<id>', methods=['PUT'])
def equipment_update(id):
    type = request.json['type_of_equipment']
    weight = request.json['weight']
    produce_name = request.json['produce_name']
    amort = request.json['amort']

    new_equipment = Equipment.query.get(id)
    new_equipment.id = id
    new_equipment.weight = weight
    new_equipment.produce_name = produce_name
    new_equipment.type = type
    new_equipment.amort = amort


    db.session.commit()

    return new_equipment.__str__()


@app.route('/equipment/<id>', methods=['DELETE'])
def equipment_delete(id):
    equipment_delete = Equipment.query.get(id)
    db.session.delete(equipment_delete)
    db.session.commit()
    return str("Deleted")