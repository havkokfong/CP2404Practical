public class PetSold extends ItemSold {
    boolean vaccinated, neuterted, housebroken;

    public void setVaccinated(boolean declare){
        vaccinated = declare;
    }

    public void setNeuterted(boolean declare){
        neuterted = declare;
    }

    public void setHouseBroken(boolean declare){
        housebroken = declare;
    }

    public boolean getVaccinated(){
        return vaccinated;
    }

    public boolean getNeuterted(){
        return neuterted;
    }

    public boolean getHouseBroken(){
        return housebroken;
    }
}
