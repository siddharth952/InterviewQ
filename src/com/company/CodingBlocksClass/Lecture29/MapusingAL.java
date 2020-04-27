package com.company.CodingBlocksClass.Lecture29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class MapusingAL<K,V> {

    ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

    private int size = 0;
    private float lf = 0.5f; // Can be changed 0.60 etc And f for as ( 0.5 is double type)


    public MapusingAL() {

        for (int i = 0; i <100 ; i++) {
            entities.add(new LinkedList<>());
        }
    }




    public void put(K key, V value){

       // if(  (float))
    }


    private void rehash(){
        ArrayList<LinkedList<Entity>> old = entities;

        entities = new ArrayList<>();
        for (int i =0;i<old.size()*2; i++){
            entities.add(new LinkedList<>()); //add new Linked lists for each of map

        }

        size = 0; //As we need to be 0 while adding

        for(LinkedList<Entity> list:old){
            for(Entity entity:list){
                put(entity.key,entity.value);
            }
        }


    }



    public V get(K key){

        int hashcode = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {

            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key){

        int hashcode = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        Entity target =null;

        for (Entity entity: list) {

            if (entity.key.equals(key)) {
                target= entity;
                size--;
                break;
            }
        }
        list.remove(target);
    }

    class Entity{
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}