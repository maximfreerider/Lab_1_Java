from app import ma


class EquipmentStructure(ma.Schema):
    class Meta:
        fields = ('id', 'weight', 'type', 'produce_name', 'amort')