package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Equipment;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

    @Named
    @Dependent
    public class EquipmentIImpl extends AbstractDao<Equipment> implements EquipmentI, Serializable {

        private static final long serialVersionUID = 1L;

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        protected Class<Equipment> getEntityClass() {
            return Equipment.class;
        }

        //@Resource
        //private UserTransaction userTransaction;

    }


