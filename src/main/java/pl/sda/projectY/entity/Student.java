package pl.sda.projectY.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * author:
 * Mateusz
 * Marczak
 **/
@Entity
public class Student {

    @Id
    @Column(name = "REG_NUM")
    private String regNum;

    @Column(name = "USER_ID")
    private Integer userId;

    private String name;
    private String surname;
    private String pesel;

    @Column(name = "pk_num")
    private String pkNum;

    private String telephone;
    @Column(name = "i_doc_num")
    private String idNumber;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne
    @Column(name = "INST_NUM")
    private String instNumber;



}
