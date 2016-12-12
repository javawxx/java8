package com.wxx;

/**
 * @author: wstar
 * @version: 1.0 version
 * @description:
 * @create time: 16-12-12 下午3:33
 */
public class IfaceDefaultMethod {

    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.print();
    }

    interface Vehicle {
        default void print(){
            System.out.println("我是一辆车!");
        }

        static void blowHorn(){
            System.out.println("按喇叭!!!");
        }
    }

    interface FourWheeler {
        default void print(){
            System.out.println("我是一辆四轮车!");
        }
    }

    static class Car implements Vehicle, FourWheeler {
        public void print(){
            Vehicle.super.print();
            FourWheeler.super.print();
            Vehicle.blowHorn();
            System.out.println("我是一辆汽车!");
        }
    }

}
