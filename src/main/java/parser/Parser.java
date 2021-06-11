package parser;

import com.google.gson.Gson;
import model.Root;

public class Parser {

    public Root parseJson(String json){
        Gson gson = new Gson();
        Root root = gson.fromJson(json, Root.class);
        return root;
    }

}
