package com.get.calcengine;

// This is to explain accessor and mutator functions in Java

public class MathEquation {

    private double leftVal;
    private double rightVal;
    public char opCode;
    public double result;

        public double getLeftVal(){
            return leftVal;
        }
        public void setLeftVal(double leftVal){
            this.leftVal = leftVal;
        }
            public double getRightVal(){
            return rightVal;
        }
            public void setRightVal(double rightVal){
            this.rightVal = rightVal;
            }
            public char getOpCode(){
            return opCode;
            }

            public void setOpCode(char opCode){
            this.opCode = opCode;
            }

            public double getResult(){
            return result;

            }

   /* public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;*/

    public MathEquation(){};

    public void execute(){
        switch (opCode){
            case 'a':
                result = leftVal + rightVal;
                break;

            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = (leftVal / rightVal);
                break;
            default:
                System.out.println("Error - invalid opcode");
                break;

        }




    }

}
