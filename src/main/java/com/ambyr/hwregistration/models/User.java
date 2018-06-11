package com.ambyr.hwregistration.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import static javax.persistence.GenerationType.TABLE;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy=TABLE)
    @Column(name="USER_ID")
    Long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name ="LAST_NAME")
    private String lastName;

    @Column(name ="ADDRESS")
    private String address;

    @Column(name ="ADDRESS2")
    private String address2 ="";

    @Column(name ="CITY")
    private String city;

    @Column(name ="STATE")
    private String stateID;

    @Column(name ="ZIP")
    private String zip;

    @Column(name ="COUNTRY")
    private String country = "US";

    @Column(name = "REG_DATE")
    private String regDate;

}
