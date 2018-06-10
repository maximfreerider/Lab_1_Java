from app import db


class Equipment(db.Model):
    __tablename__ = "equipments"
    id = db.Column('id', db.Integer, primary_key=True)
    type = db.Column('type', db.String(45))
    weight = db.Column('weight', db.Integer)
    produce_name = db.Column('produce_name', db.String(45))
    amort = db.Column('amort', db.String)

    def __str__(self):
        return 'equipment id: ' + str(self.id) + '\n type: ' + str(
            self.type) + "\n weight : " + str(self.weight) + '\nproduce_name: ' + str(self.produce_name) + '\namort: ' + str(self.amort)