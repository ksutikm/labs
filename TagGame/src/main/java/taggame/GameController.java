package taggame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.event.ActionEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.input.*;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable{

    @FXML
    private VBox vBox;
    @FXML
    private HBox hBox1;
    @FXML
    private VBox vBoxMenu;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;
    @FXML
    public Button btn10;
    @FXML
    public Button btn11;
    @FXML
    public Button btn12;
    @FXML
    public Button btn13;
    @FXML
    public Button btn14;
    @FXML
    public Button btn15;
    @FXML
    public Button btn16;






//    public void initialize() {
//
//    }

    private ButtonsList buttonsList = new ButtonsList();
    private int[] a;
    private int buf, numButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttonsList.shuffle();
        a = buttonsList.getButtonsList();
        if (a[0] != 0) {
            btn1.setText(Integer.toString(a[0]));
        }
        if (a[1] != 0) {
            btn2.setText(Integer.toString(a[1]));
        }
        if (a[2] != 0) {
            btn3.setText(Integer.toString(a[2]));
        }
        if (a[3] != 0) {
            btn4.setText(Integer.toString(a[3]));
        }
        if (a[4] != 0) {
            btn5.setText(Integer.toString(a[4]));
        }
        if (a[5] != 0) {
            btn6.setText(Integer.toString(a[5]));
        }
        if (a[6] != 0) {
            btn7.setText(Integer.toString(a[6]));
        }
        if (a[7] != 0) {
            btn8.setText(Integer.toString(a[7]));
        }
        if (a[8] != 0) {
            btn9.setText(Integer.toString(a[8]));
        }
        if (a[9] != 0) {
            btn10.setText(Integer.toString(a[9]));
        }
        if (a[10] != 0) {
            btn11.setText(Integer.toString(a[10]));
        }
        if (a[11] != 0) {
            btn12.setText(Integer.toString(a[11]));
        }
        if (a[12] != 0) {
            btn13.setText(Integer.toString(a[12]));
        }
        if (a[13] != 0) {
            btn14.setText(Integer.toString(a[13]));
        }
        if (a[14] != 0) {
            btn15.setText(Integer.toString(a[14]));
        }
        if (a[15] != 0) {
            btn16.setText(Integer.toString(a[15]));
        }

//        vBox.setVisible(false);

    }



    @FXML
    public void btn1Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            numButton = 0;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn1.setText("");
                btn2.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn1.setText("");
                btn5.setText(Integer.toString(a[numButton + 4]));

            }

        }
    }

    @FXML
    public void btn1Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 0;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn1.setText("");
                btn2.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn1.setText("");
                btn5.setText(Integer.toString(a[numButton + 4]));

            }

        }
    }

    @FXML
    public void btn2Action(MouseEvent me) {
        if (me.getClickCount() == 2) {

            numButton = 1;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn2.setText("");
                btn1.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn2.setText("");
                btn3.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn2.setText("");
                btn6.setText(Integer.toString(a[numButton + 4]));
            }

        }
    }

    @FXML
    public void btn2Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 1;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn2.setText("");
                btn1.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn2.setText("");
                btn3.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn2.setText("");
                btn6.setText(Integer.toString(a[numButton + 4]));
            }

        }
    }

    @FXML
    public void btn3Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 2;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn3.setText("");
                btn2.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn3.setText("");
                btn4.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn3.setText("");
                btn7.setText(Integer.toString(a[numButton + 4]));
            }

        }
    }

    @FXML
    public void btn3Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 2;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn3.setText("");
                btn2.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn3.setText("");
                btn4.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn3.setText("");
                btn7.setText(Integer.toString(a[numButton + 4]));
            }

        }
    }

    @FXML
    public void btn4Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            numButton = 3;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn4.setText("");
                btn3.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn4.setText("");
                btn8.setText(Integer.toString(a[numButton + 4]));

            }

        }
    }

    @FXML
    public void btn4Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 3;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn4.setText("");
                btn3.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn4.setText("");
                btn8.setText(Integer.toString(a[numButton + 4]));

            }

        }
    }

    @FXML
    public void btn5Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            numButton = 4;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn5.setText("");
                btn6.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn5.setText("");
                btn1.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn5.setText("");
                btn9.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn5Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 4;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn5.setText("");
                btn6.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn5.setText("");
                btn1.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn5.setText("");
                btn9.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn6Action(MouseEvent me) {
        if (me.getClickCount() == 2){
            numButton = 5;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn6.setText("");
                btn2.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn6.setText("");
                btn5.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn6.setText("");
                btn7.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn6.setText("");
                btn10.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn6Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 5;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn6.setText("");
                btn2.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn6.setText("");
                btn5.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn6.setText("");
                btn7.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn6.setText("");
                btn10.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn7Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2){
            numButton = 6;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn7.setText("");
                btn3.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn7.setText("");
                btn6.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn7.setText("");
                btn8.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn7.setText("");
                btn11.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn7Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 6;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn7.setText("");
                btn3.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn7.setText("");
                btn6.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn7.setText("");
                btn8.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn7.setText("");
                btn11.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn8Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 7;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn8.setText("");
                btn4.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn8.setText("");
                btn7.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn8.setText("");
                btn12.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn8Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 7;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn8.setText("");
                btn4.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn8.setText("");
                btn7.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn8.setText("");
                btn12.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn9Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 8;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn9.setText("");
                btn10.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn9.setText("");
                btn5.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn9.setText("");
                btn13.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn9Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 8;
            if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn9.setText("");
                btn10.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton-4] == 0){
                int buf;
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn9.setText("");
                btn5.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn9.setText("");
                btn13.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn10Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 9;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn10.setText("");
                btn6.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn10.setText("");
                btn9.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn10.setText("");
                btn11.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn10.setText("");
                btn14.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn10Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 9;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn10.setText("");
                btn6.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn10.setText("");
                btn9.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn10.setText("");
                btn11.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn10.setText("");
                btn14.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn11Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 10;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn11.setText("");
                btn7.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn11.setText("");
                btn10.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn11.setText("");
                btn12.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn11.setText("");
                btn15.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn11Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 10;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn11.setText("");
                btn7.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn11.setText("");
                btn10.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn11.setText("");
                btn12.setText(Integer.toString(a[numButton + 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn11.setText("");
                btn15.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn12Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 11;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn12.setText("");
                btn8.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn12.setText("");
                btn11.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn12.setText("");
                btn16.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn12Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 11;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn12.setText("");
                btn8.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn12.setText("");
                btn11.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton + 4] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 4];
                a[numButton + 4] = buf;
                btn12.setText("");
                btn16.setText(Integer.toString(a[numButton + 4]));
            }
        }
    }

    @FXML
    public void btn13Action(MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 12;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn13.setText("");
                btn9.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn13.setText("");
                btn14.setText(Integer.toString(a[numButton + 1]));

            }
        }
    }

    @FXML
    public void btn13Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 12;
            if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn13.setText("");
                btn9.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn13.setText("");
                btn14.setText(Integer.toString(a[numButton + 1]));

            }
        }
    }

    @FXML
    public void btn14Action(MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 13;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn14.setText("");
                btn13.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn14.setText("");
                btn10.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn14.setText("");
                btn15.setText(Integer.toString(a[numButton + 1]));

            }
        }
    }

    @FXML
    public void btn14Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 13;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn14.setText("");
                btn13.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn14.setText("");
                btn10.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn14.setText("");
                btn15.setText(Integer.toString(a[numButton + 1]));

            }
        }
    }

    @FXML
    public void btn15Action(javafx.scene.input.MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 14;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn15.setText("");
                btn14.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn15.setText("");
                btn11.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn15.setText("");
                btn16.setText(Integer.toString(a[numButton + 1]));

            }
        }
    }

    @FXML
    public void btn15Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 14;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn15.setText("");
                btn14.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn15.setText("");
                btn11.setText(Integer.toString(a[numButton-4]));

            } else if (a[numButton + 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton + 1];
                a[numButton + 1] = buf;
                btn15.setText("");
                btn16.setText(Integer.toString(a[numButton + 1]));

            }
        }
    }

    @FXML
    public void btn16Action(MouseEvent me) {
        if (me.getClickCount() == 2) {
            numButton = 15;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn16.setText("");
                btn15.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn16.setText("");
                btn12.setText(Integer.toString(a[numButton-4]));

            }
        }
    }

    @FXML
    public void btn16Key(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER) {
            numButton = 15;
            if (a[numButton - 1] == 0) {
                buf = a[numButton];
                a[numButton] = a[numButton - 1];
                a[numButton - 1] = buf;
                btn16.setText("");
                btn15.setText(Integer.toString(a[numButton - 1]));

            } else if (a[numButton-4] == 0){
                buf = a[numButton];
                a[numButton] = a[numButton-4];
                a[numButton-4] = buf;
                btn16.setText("");
                btn12.setText(Integer.toString(a[numButton-4]));

            }
        }
    }
}
