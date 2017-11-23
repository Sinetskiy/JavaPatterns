import decorators.BorderDecorator;
import decorators.ColorDecorator;
import objects.Button;
import objects.Component;
import objects.TextView;
import objects.Window;

public class Start {

    private static Component window;
    private static Component textView;
    private static Component button;

    public static void main(String[] args) {

        boolean showBorder = true;
        boolean drawColor = true;

        if(!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new Button();
        }

        if(drawColor) {
            textView = new ColorDecorator(textView);
            button = new ColorDecorator(button);
        }

        window.draw();
        textView.draw();
        button.draw();

    }
}
