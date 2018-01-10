import models.Kombucha;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
/**
 * Created by Guest on 1/9/18.
 */
public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Kombucha> applesArray = Kombucha.getAllApple();
//            ArrayList<Kombucha> grapesArray = Kombucha.getAllGrape();
            model.put("allApples", applesArray);
//            model.put("grapes", grapesArray);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/Kombucha/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String kombuchaReview = request.queryParams("kombuchaReview");
            String kombuchaFlavor = request.queryParams("kombuchaFlavor");
            Kombucha newReview = new Kombucha(kombuchaReview, kombuchaFlavor);
            if(newReview.getKombuchaFlavor().equals("apples")) {
            model.put("kombuchas", Kombucha.getAllApple());
            } else {
            model.put("kombuchas", Kombucha.getAllGrape());
            }
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
