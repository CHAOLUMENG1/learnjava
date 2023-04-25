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
import propertyBean.BukenBean;
import propertyBean.BuyerBean;
import propertyBean.JoinBean1;
import propertyConn.JdbcConn;

/**
 * 契約一覧
 *
 * @author CHAOY
 */
public class BuyerService {

    public List<JoinBean1> listInfo() {
        propertyConn.JdbcConn jc = new propertyConn.JdbcConn();
        List<JoinBean1> list = new ArrayList<JoinBean1>();

        try {
            jc.getDbcom();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuyerService.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "SELECT s.contract_id,s.property_id,p.property_name,p.address,p.property_type,s.buyer_name, s.contract_date,s.price\n"
                + "FROM SaleContract s\n"
                + "INNER JOIN Property p\n"
                + "ON s.property_id = p.property_id";

        ResultSet resultSet;
        try {
            resultSet = jc.tt(sql);
            while (resultSet.next()) {
                JoinBean1 joinBean1 = new JoinBean1();
                joinBean1.setContractId((resultSet.getInt("contract_id")));
                joinBean1.setPropertyId(resultSet.getInt("property_id"));
                joinBean1.setPropertyName(resultSet.getString("property_name"));
                joinBean1.setAddress(resultSet.getString("address"));
                joinBean1.setPropertyType(resultSet.getString("property_type"));
                joinBean1.setBuyerName(resultSet.getString("buyer_name"));
                joinBean1.setContractDate(resultSet.getString("contract_date"));
                joinBean1.setPrice(resultSet.getInt("price"));
                list.add(joinBean1);
            }
            jc.closeDbcom();
        } catch (SQLException ex) {
            Logger.getLogger(BuyerService.class.getName()).log(Level.SEVERE, null, ex);
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
    public void BuyerInsert(String contract_id, String property_id, String buyer_name, String contract_date, String price) throws SQLException {
        LocalDateTime date = LocalDateTime.now();
        JdbcConn jc = new JdbcConn();
        LocalDateTime createDateTime = LocalDateTime.now();
        LocalDateTime updateDateTime = createDateTime.plusYears(1);
        try {
            jc.getDbcom();

            String sql = "insert into SaleContract( contract_id , property_id , buyer_name , contract_date , price,create_date,modify_date,del_flag) "
                    + "values(" + contract_id + ",'" + property_id + "','" + buyer_name + "','" + contract_date + "','" + price + "','" + createDateTime
                    + "','" + updateDateTime + "'," + 0 + ")";
            System.out.print(sql);
            jc.cud(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuyerService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 情報更新
     *
     * @param bb
     * @throws SQLException
     */
    public void BuyerUpdate(BuyerBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            StringBuffer sb = new StringBuffer();
            sb.append("update SaleContract set ");
            sb.append("property_id = '" + bb.getPropertyId() + "',");
            sb.append("buyer_name = '" + bb.getBuyerName() + "',");
            sb.append("contract_date = '" + bb.getContractDate() + "',");
            sb.append("price = " + bb.getPrice() + "");
            sb.append(" where ");
            sb.append(" contract_id = " + bb.getContractId());
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuyerService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 情報削除
     *
     * @param
     * @throws SQLException
     */
    public void BuyerDelete(BuyerBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            StringBuffer sb = new StringBuffer();
            sb.append("delete from SaleContract ");
            sb.append(" where ");
            sb.append(" contract_id = '" + bb.getContractId() + "'");
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuyerService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
