from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_marshmallow import Marshmallow

app = Flask(__name__) #запускалка нашого сервера
ma = Marshmallow(app) #cтворення обєкту

app.config.from_pyfile('config.py')

db = SQLAlchemy(app)

from views import *

import sys

sys.path.insert(0, 'views') #вставка коду сюди


if __name__ == '__main__':
    app.run() #запускаємо сервер
