import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    public Button btnDevide;
    public Button btnPresntage;
    public Button btnClear;
    public Button btnMultiply;
    public Button btnNine;
    public Button btnEight;
    public Button btnSeven;
    public Button btnSubtraction;
    public Button btnSix;
    public Button btnFive;
    public Button btnFour;
    public Button btnThree;
    public Button btnTwo;
    public Button btnOne;
    public Button btnAddition;
    public Button btnEqual;
    public Button btnDot;
    public Button btnZero;
    public Label lblAnswer;
    public Label lblInput;
    public TextField txtInputValue;
    public Button btnClearOneByOne;

    long number1 = 0;
    long number2 = 0;
    int symbol = 0;
    int temp = 0;

    public void devideOnAction(ActionEvent actionEvent) {
        symbol = 1;
        txtInputValue.setText("" + number1 + " /");
        temp = 1;
    }

    public void presentageOnAction(ActionEvent actionEvent) {
        symbol = 1;
        txtInputValue.setText("" + number1 + " %");
        temp = 2;
    }

    public void multiplyOnAction(ActionEvent actionEvent) {
        symbol = 1;
        txtInputValue.setText("" + number1 + " *");
        temp = 3;
    }

    public void subtractionOnAction(ActionEvent actionEvent) {
        symbol = 1;
        txtInputValue.setText("" + number1 + " -");
        temp = 4;
    }

    public void additionOnAction(ActionEvent actionEvent) {
        symbol = 1;
        txtInputValue.setText("" + number1 + " +");
        temp = 5;
    }

    public void nineOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 9;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 9;
            txtInputValue.setText("" + number2);
        }
    }

    public void eightOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 8;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 8;
            txtInputValue.setText("" + number2);
        }
    }

    public void sevenOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 7;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 7;
            txtInputValue.setText("" + number2);
        }
    }

    public void sixOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 6;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 6;
            txtInputValue.setText("" + number2);
        }
    }

    public void fiveOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 5;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 5;
            txtInputValue.setText("" + number2);
        }
    }

    public void fourOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 4;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 4;
            txtInputValue.setText("" + number2);
        }
    }

    public void threeOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 3;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 3;
            txtInputValue.setText("" + number2);
        }
    }

    public void twoOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 2;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 2;
            txtInputValue.setText("" + number2);
        }
    }

    public void oneOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 1;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 1;
            txtInputValue.setText("" + number2);
        }
    }

    public void dotOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 1;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 1;
            txtInputValue.setText("" + number2);
        }
    }

    public void zeroOnAction(ActionEvent actionEvent) {
        if (symbol == 0) {
            number1 = (number1 * 10) + 0;
            txtInputValue.setText("" + number1);
        } else {
            number2 = (number2 * 10) + 0;
            txtInputValue.setText("" + number2);
        }
    }

    public void equalOnAction(ActionEvent actionEvent) {
        switch (temp) {
            case (1):
                txtInputValue.setText("" + number1 + " / " + number2);
                long total1 = number1 / number2;
                lblAnswer.setText("" + total1);
                number1= Long.parseLong(lblAnswer.getText());
                number2=0;
                break;
            case (2):
                txtInputValue.setText("" + number1 + " % " + number2);
                long total2 = number1 % number2;
                lblAnswer.setText("" + total2);
                number1= Long.parseLong(lblAnswer.getText());
                number2=0;
                break;
            case (3):
                txtInputValue.setText("" + number1 + " * " + number2);
                long total3 = number1 * number2;
                lblAnswer.setText("" + total3);
                number1= Long.parseLong(lblAnswer.getText());
                number2=0;
                break;
            case (4):
                txtInputValue.setText("" + number1 + " - " + number2);
                long total4 = number1 - number2;
                lblAnswer.setText("" + total4);
                number1= Long.parseLong(lblAnswer.getText());
                number2=0;
                break;
            case (5):
                txtInputValue.setText("" + number1 + " + " + number2);
                long total5 = number1 + number2;
                lblAnswer.setText("" + total5);
                number1= Long.parseLong(lblAnswer.getText());
                number2=0;
                break;
        }
    }

    public void clear1by1OnAction(ActionEvent actionEvent) {
    }
    public void clearOnAction(ActionEvent actionEvent) {
        number1 = 0;
        number2 = 0;
        symbol = 0;
        temp = 0;
        txtInputValue.setText(null);
        lblAnswer.setText(null);
    }
}
