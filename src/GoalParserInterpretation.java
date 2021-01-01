import java.util.Map;

public class GoalParserInterpretation {

    public static void main(String[] args) {
	String command = "G()(al)";
	String output = interpret(command);
	System.out.println(output);
    }

    private static String interpret(String command) {
	return command.replace("()", "o").replace("(al)","al");
    }

}
