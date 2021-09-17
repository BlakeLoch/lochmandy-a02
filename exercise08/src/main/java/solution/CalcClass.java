package solution;

/*
    CalcClass
        method calcNumberOfSlices(int numberOfPizzas, int slicesPerPizza)
            return numberOfPizzas * slicesPerPizza
        method calcSlicesPerPerson(int numberOfPeople, int numberOfSlices)
            return numberOfSlices / numberOfPeople
        method calcLeftoverSlices(int numberOfSlices, int slicesPerPerson, int numberOfPeople)
            return return numberOfSlices - (slicesPerPerson * numberOfPeople)

    */

public class CalcClass {

    public int calcNumberOfSlices(int numberOfPizzas, int slicesPerPizza){
        return numberOfPizzas * slicesPerPizza;
    }

    public int calcSlicesPerPerson(int numberOfPeople, int numberOfSlices){
        return numberOfSlices / numberOfPeople;
    }

    public int calcLeftoverSlices(int numberOfSlices, int slicesPerPerson, int numberOfPeople){
        return numberOfSlices - (slicesPerPerson * numberOfPeople);
    }

}
