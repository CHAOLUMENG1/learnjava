/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertyService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import propertyBean.BuyerBean;
import propertyBean.HouseBean;
import propertyBean.JoinBean2;
import propertyConn.JdbcConn;

/**
 * 部屋一覧
 *
 * @author CHAOY
 */
public class HouseService {

    public List<JoinBean2> listInfo() throws SQLException {
        propertyConn.JdbcConn jc = new propertyConn.JdbcConn();
        List<JoinBean2> list = new ArrayList<JoinBean2>();

        try {
            jc.getDbcom();

            String sql = "SELECT p.property_id, h.room_id,p.property_name,\n"
                    + "h.room_num, h.pattern, h.area\n"
                    + "FROM Property p\n"
                    + "LEFT JOIN House h ON p.property_id = h.property_id;";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    JoinBean2 joinBean2 = new JoinBean2();
                    joinBean2.setPropertyId((resultSet.getInt("property_id")));
                    joinBean2.setRoomId(resultSet.getInt("room_id"));
                    joinBean2.setPropertyName(resultSet.getString("property_name"));
                    joinBean2.setRoomNum(resultSet.getString("room_num"));
                    joinBean2.setPattern(resultSet.getString("pattern"));
                    joinBean2.setArea(resultSet.getString("area"));
                    list.add(joinBean2);

                    jc.closeDbcom();
                }

            } catch (SQLException ex) {
                Logger.getLogger(HouseService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HouseService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    /**
     * 情報を挿入
     *
     * @param
     * @param
     * @throws SQLException
     */
    public void HouseInsert(String property_id, String room_id, String property_name,String room_num, String pattern, String area) throws SQLException {
        LocalDateTime date = LocalDateTime.now();
        JdbcConn jc = new JdbcConn();
        LocalDateTime createDateTime = LocalDateTime.now();
        LocalDateTime updateDateTime = createDateTime.plusYears(1);
        try {
            jc.getDbcom();

            String sql = "insert into House( property_id , room_id , property_name,room_num , pattern , area,create_date,modify_date,del_flag) "
                    + "values(" + property_id + ",'" + room_id + "','" +property_name+ "','"+ room_num + "','" + pattern + "','" + area + "','" + createDateTime
                    + "','" + updateDateTime + "'," + 0 + ")";
            System.out.print(sql);
            jc.cud(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HouseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 情報更新
     *
     * @param bb
     * @throws SQLException
     */
    public void HouseUpdate(JoinBean2 bb) throws SQLException {
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            StringBuffer sb = new StringBuffer();
            sb.append("update House set ");
            sb.append("room_id = '" + bb.getRoomId() + "',");
            sb.append("property_name = '" + bb.getPropertyName() + "',");
            sb.append("room_num = '" + bb.getRoomNum() + "',");
            sb.append("pattern = '" + bb.getPattern() + "',");
            sb.append("area = " + bb.getArea() + "");
            sb.append(" where ");
            sb.append(" property_id = " + bb.getPropertyId());
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HouseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 情報削除
     *
     * @param
     * @throws SQLException
     */
    public void HouseDelete(HouseBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            StringBuffer sb = new StringBuffer();
            sb.append("delete from House ");
            sb.append(" where ");
            sb.append(" property_id = '" + bb.getPropertyId() + "'");
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HouseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
