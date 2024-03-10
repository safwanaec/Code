import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class scrptengn {
    public static void main(String[] args) {
        try {
            //Object result = evaluateEquation("6+9");
            //Double d = (Double) result;

            System.out.println(evaluateEquation("6+9.0").doubleValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Number evaluateEquation(String equation) throws Exception {
        ScriptEngineManager equationManager = new ScriptEngineManager();
        ScriptEngine evaluator = equationManager.getEngineByName("Groovy");

        if (evaluator == null) {
            throw new RuntimeException("Groovy engine not found");
        }
       // eval returns either a primitive type or a Double object
       Number result = (Number) evaluator.eval(equation);

       // If it's a Double, return it directly; otherwise, convert to Double
       return (result instanceof Double) ? (Double) result : result.doubleValue();
    }
}
