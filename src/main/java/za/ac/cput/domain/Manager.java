package za.ac.cput.domain;

public class Manager extends Employee{
    private double bonus;
    private Manager(){}

    private Manager(Builder builder){this.bonus = builder.bonus;}

    double getBonus(){return bonus;}

    public static class Builder{
        private double bonus;

        public Builder setBonus(double bonus){
            this.bonus = bonus;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
