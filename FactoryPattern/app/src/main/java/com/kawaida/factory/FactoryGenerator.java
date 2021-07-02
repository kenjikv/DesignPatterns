package com.kawaida.factory;

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factoryType){

        if(factoryType == null){
            return null;
        }

        if(factoryType == "BRE"){
            return new BreadFactory();
        }else if (factoryType == "FIL"){
            return new FillingFactory();
        }else if (factoryType == "DRI"){
            return new DrinkFactory();
        }

        return null;
    }

}
