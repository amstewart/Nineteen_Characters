/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import src.DirectionEnum;
import src.model.MapRelationship;
import src.controller.Entity;

/**
 * Tells an entity what it can do with the map.
 *
 * @author JohnReedLOL
 */
public class MapEntityRelationship extends MapRelationship {

    private final Entity entity_;

    MapEntityRelationship(Entity entity) {
        entity_ = entity;
    }

    public void moveInDirection(DirectionEnum direction)

map_reference_.moveOneTile(this, direction);
    }

    public void sendChat();

    public void recieveChat();

    public void sendAttackInDirection();

    public void recieveAttackFromEntity();

    public void useItemInDirection();

    public void pickUpItemInDirection();

    public void dropItem();

    public void tossItemInDirection();
}
