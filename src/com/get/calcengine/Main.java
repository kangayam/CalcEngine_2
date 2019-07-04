package com.get.calcengine;
// Accessor and mutator - example
public class Main {

    public static void main(String[] args) {

        // write your code here
        MathEquation [] equations = new MathEquation[4];
//        System.out.println (equations);
        equations[0] = create(100.d,50.0d,'a');
        equations[1] = create(100.d,50.0d,'m');
        equations[2] = create(100.d,50.0d,'s');
        equations[3] = create(100.d,50.0d,'d');


        for (MathEquation equation : equations){
//            System.out.println (equation);
            equation.execute();
            System.out.print("result =");
//            System.out.println(equation.result);
            System.out.println(equation.getResult());
        }

    }



    public static MathEquation create(double leftVal, double rightVal, char opCode){

        MathEquation equation = new MathEquation();
//        equation.leftVal = leftVal;
//        equation.rightVal=rightVal;
//        equation.opCode=opCode;
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;

    }


}


