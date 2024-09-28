/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvc01;

import View.LayoutFrame;
import com.edu.ijse.db.DBConnection;

import java.sql.SQLException;

/**
 *
 * @author Kaweesha
 */
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Welcome to MVC01");
        DBConnection.getInstance().getConnection();

        new LayoutFrame().setVisible(true);
    }
}
