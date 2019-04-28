package datastructure;

import com.sun.javafx.collections.MappingChange;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) throws Exception {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        // List and map
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Java", "Harder");
        map.put("Python", "Easy");
        list.add(map);
        System.out.println(list);

        System.out.println();
        // Another sample
        Map<String, List<String>> phoneBrand = new HashMap<>();
        List<String> americanPhone = new ArrayList<>();
        americanPhone.add("iPhone XS-Max");
        americanPhone.add("iPhone XR");
        americanPhone.add("iPhone 8 Plus");
        americanPhone.add("iPhone SE");

        List<String> chinesePhone = new ArrayList<>();
        chinesePhone.add("Huawei P30 Pro");
        chinesePhone.add("Huawei Mate 20");
        chinesePhone.add("Huawei Honor 20");
        chinesePhone.add("Xiaomi 9");

        List<String> otherCountryPhone = new ArrayList<>();
        otherCountryPhone.add("Sumsung Galaxy");
        otherCountryPhone.add("Sony xx");
        otherCountryPhone.add("Panasonic xx");

        phoneBrand.put("USA", americanPhone);
        phoneBrand.put("China", chinesePhone);
        phoneBrand.put("Other countries", otherCountryPhone);

        for(Map.Entry entry: phoneBrand.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }


        //add to database
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        List<String> countryList = new ArrayList<>();
        List<String> americanPhoneList = new ArrayList<>();
        List<String> chinesePhoneList = new ArrayList<>();
        List<String> otherCountryPhoneList = new ArrayList<>();
        for(Map.Entry entry: phoneBrand.entrySet()){
            countryList.add((String) entry.getKey());
            if(entry.getKey().equals("USA")){
                americanPhoneList = (List<String>) ((ArrayList) entry.getValue()).clone();
            }
            if(entry.getKey().equals("China")){
                chinesePhoneList = (List<String>) ((ArrayList) entry.getValue()).clone();
            }if(entry.getKey().equals("Other countries")){
                otherCountryPhoneList = (List<String>) ((ArrayList) entry.getValue()).clone();
            }
        }

        /*
        //create database
        connectToSqlDB.insertDataFromStringArrayListToMySql(countryList, "tbl_cell phone", "country");
        connectToSqlDB.insertDataFromStringArrayListToMySql(americanPhoneList, "tbl_americanPhoneBrand", "americanCellPhone");
        connectToSqlDB.insertDataFromStringArrayListToMySql(chinesePhoneList, "tbl_chinesePhoneBrand", "chineseCellPhone");
        connectToSqlDB.insertDataFromStringArrayListToMySql(otherCountryPhoneList, "tbl_otherCountryPhoneBrand", "otherCountryCellPhone");

        //retrieve data from database
        List<String> readoutCountry = connectToSqlDB.readDataBase("tbl_cell phone", "country");
        for(String x: readoutCountry) System.out.print(x+ " ");
        List<String> readoutAmericanPhoneBrand = connectToSqlDB.readDataBase("tbl_americanPhoneBrand", "americanCellPhone");
        for(String x: readoutAmericanPhoneBrand) System.out.print(x+ " ");
        List<String> readoutChinesePhoneBrand = connectToSqlDB.readDataBase("tbl_chinesePhoneBrand", "chineseCellPhone");
        for(String x: readoutChinesePhoneBrand) System.out.print(x+ " ");
        List<String> readoutotherCountryPhoneBrand = connectToSqlDB.readDataBase("tbl_otherCountryPhoneBrand", "otherCountryCellPhone");
        for(String x: readoutotherCountryPhoneBrand) System.out.print(x+ " ");

         */

    }

}
