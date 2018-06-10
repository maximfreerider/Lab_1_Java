from flask import Flask, jsonify, abort, make_response, request
from equipment import Equipment
from sport_type import SportType
app = Flask(__name__)

my_dict = {'1': Equipment("USA", 125, SportType.MOUNTAINBIKE),
                  '2': Equipment("Germany", 150, SportType.PARASHUTING)}


@app.route('/equipment/<id>', methods=['GET'])
def get_equipment(id):
    if id in my_dict:
        return my_dict[id].__dict__.__str__()
    else:
        abort(404)


@app.route('/equipment', methods=['POST'])
def post_equipment():
    post_data = request.get_json()
    id = post_data['id']
    produce_name = post_data['produce_name']
    weight = post_data['weight']
    type = post_data['type']
    new_equipment = Equipment(produce_name,weight,type)
    my_dict[id] = new_equipment
    return 'Posted  ' + str(my_dict(id).produceName)


@app.route('/equipment', methods=['PUT'])
def put_accommodation():
    post_data = request.get_json()
    id = post_data['id']
    number_of_rooms = post_data['number_of_rooms']
    price = post_data['price']
    area = post_data['area']
    latitude = post_data['latitude']
    new_accommodation = Accommodation(number_of_rooms, price, area, latitude)
    accommodations[id] = new_accommodation
    return 'Put'


@app.route('/accommodation/<id>', methods=['DELETE'])
def delete_accommodation(id):
    accommodations.pop(id)
    return 'Deleted'


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found'}), 404)