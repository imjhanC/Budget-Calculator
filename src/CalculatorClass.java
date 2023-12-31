public class CalculatorClass {
    private double budgetTarget;     // budget target set by the user
    private double currentSaving;    // current saving user have
    
    public CalculatorClass(){ //default Constructor

    }

    public CalculatorClass(double budgetTarget){  //constructor #2
        this.budgetTarget = budgetTarget; 
    }

    public void setbudgetTarget(double value){    // setter for budget Target
        this.budgetTarget = value;
    }

    public double getbudgetTarget(){              // getter for budget Target
        return budgetTarget;
    }
}
