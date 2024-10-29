
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage escenario) {
        Pane root = new Pane();

        Line linea1 = new Line();
        linea1.setStartX(50);
        linea1.setStartY(200);
        linea1.setEndX(100);
        linea1.setEndY(250);
        linea1.setStroke(Color.YELLOW);

        Line linea2 = new Line(100, 200, 150, 250);
        linea2.setStroke(Color.BROWN);

        Line linea3 = new Line(150, 200, 200, 250);
        linea3.setStroke(Color.PINK);
        linea3.setStrokeWidth(10);

        Line linea4 = new Line(200, 200, 250, 250);
        linea4.setStroke(Color.RED);

        Circle circulo = new Circle(300, 100, 50, Color.GREEN);

        Rectangle cuadrado = new Rectangle(150, 50, 40, 40);
        cuadrado.setFill(Color.BLUE);

        Polygon pentagono = new Polygon();
        pentagono.getPoints().addAll(new Double[] {
                300.0, 250.0,
                500.0, 250.0,
                500.0, 300.0,
                400.0, 350.0,
                300.0, 300.0 });

        RotateTransition rotarlinea = new RotateTransition(Duration.seconds(5), linea1);
        RotateTransition rotarlinea2 = new RotateTransition(Duration.seconds(5), linea2);
        RotateTransition rotarlinea3 = new RotateTransition(Duration.seconds(5), linea3);
        RotateTransition rotarlinea4 = new RotateTransition(Duration.seconds(5), linea4);

        ScaleTransition escalarCirculo = new ScaleTransition(Duration.seconds(5), circulo);

        RotateTransition rotarcuadrado = new RotateTransition(Duration.seconds(5), cuadrado);
        
        RotateTransition rotarpentagono = new RotateTransition(Duration.seconds(5), pentagono);

        escalarCirculo.setToX(0.1);
        escalarCirculo.setToY(0.1);
        escalarCirculo.setInterpolator(Interpolator.LINEAR);
        escalarCirculo.setInterpolator(Interpolator.LINEAR);

        rotarcuadrado.setFromAngle(360);
        rotarcuadrado.setToAngle(0);
        rotarcuadrado.setInterpolator(Interpolator.LINEAR);

        rotarpentagono.setFromAngle(0);
        rotarpentagono.setToAngle(360);
        rotarpentagono.setInterpolator(Interpolator.LINEAR);


        rotarlinea.setFromAngle(0);
        rotarlinea.setToAngle(360);
        rotarlinea.setInterpolator(Interpolator.LINEAR);

        rotarlinea2.setFromAngle(0);
        rotarlinea2.setToAngle(360);
        rotarlinea2.setInterpolator(Interpolator.LINEAR);

        rotarlinea3.setFromAngle(0);
        rotarlinea3.setToAngle(360);
        rotarlinea3.setInterpolator(Interpolator.LINEAR);

        rotarlinea4.setFromAngle(0);
        rotarlinea4.setToAngle(360);
        rotarlinea4.setInterpolator(Interpolator.LINEAR);


        rotarlinea.play();
        rotarlinea2.play();
        rotarlinea3.play();
        rotarlinea4.play();
        rotarcuadrado.play();
        rotarpentagono.play();
        escalarCirculo.play();

        root.getChildren().addAll(linea1, linea2, linea3, linea4, circulo, cuadrado, pentagono);

        escenario.setScene(new Scene(root, 600, 400));
        escenario.setTitle("Caso1 UD1");
        escenario.show();
    }
}
