/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuas;

/**
 *
 * @author tony
 */
public class session {
    private static String id;
    private static String level;
    private static String idname;
    public static String get_id(){
        return id;
    }
    public static void set_id(String id){
        session.id = id;
    }
    public static String get_level(){
        return level;
    }
    public static void set_level(String level){
        session.level =level;
    }
}
