package org.oson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class Beta<T> {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Beta beta = new Beta();

        Stack<String> stack = new Stack<>();
        stack.add("stack_value-2");
        stack.add("stack_value-2");
        beta.setStack(stack);

        Vector vector = new Vector();
        vector.add("vector_value-1");
        vector.add("vector_value-2");
        beta.setVector(vector);

        Map<String,Object> map = new HashMap<>();
        map.put("key-1","value-1");
        map.put("key-2","value-2");
        beta.setMap(map);

        List<String> stringList = new ArrayList<>();
        stringList.add("String-1");
        stringList.add("String-2");
        beta.setListString(stringList);

        List<Beta> betas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Beta beta1 = new Beta();
            betas.add(beta1);
        }
        beta.setList(betas);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("key1","value1");
        jsonObject1.put("key2","value2");
        beta.setJsonObject(jsonObject1);

        JSONArray jsonArray1 = new JSONArray();
        for (int i = 0; i < 2; i++) {
            JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("key1","value1");
            jsonArray1.put(jsonObject2);
        }
        beta.setJsonArray(jsonArray1);

        Map<String,Object> mMap = new HashMap<>();
        mMap.put("key1","value1");
        mMap.put("key2","value2");
        beta.setMap(mMap);


        Beta beta1 = new Beta();
        beta.setT(beta1);

        OSON oson = new OSON();
        oson.setDebug(false);

        String json = oson.toJson(beta);
        System.out.println("----TO JSON--->" + json);

        Beta decode = oson.toObject(json,Beta.class,"t",Beta.class);

        long useTime = System.currentTimeMillis() - time;
        System.out.println("----TO OBJECT--->" + oson.toJson(decode)+ "\ntime:" + useTime+"ms");
    }

    private T t;
    private String version = "1.0";
    private boolean debug;
    private float speed;
    private int score;
    private double value;
    private String[] array;
    private List<String> listString;
    private List<Beta> list;
    private Stack stack;
    private Vector<Object> vector;
    private JSONObject jsonObject;
    private JSONArray jsonArray;
    private Map<String, Object> map;
    private List<Map<String, JSONObject>> listMap;


    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }

    public List<String> getListString() {
        return listString;
    }

    public void setListString(List<String> listString) {
        this.listString = listString;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String array[]) {
        this.array = array;
    }

    public List<Beta> getList() {
        return list;
    }

    public void setList(List<Beta> list) {
        this.list = list;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Map<String, JSONObject>> getListMap() {
        return listMap;
    }

    public void setListMap(List<Map<String, JSONObject>> listMap) {
        this.listMap = listMap;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }
}
