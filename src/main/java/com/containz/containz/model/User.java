package com.containz.containz.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

import org.hibernate.annotations.Index;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by  .
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number")
    private String mobileNumber;
    
    private Integer coins=0;
    
    private String username;
    
    @OneToMany(mappedBy = "userHistory", cascade = CascadeType.ALL)
    private List<LoginHistory> loginHistoryList = new ArrayList<>();
    
    public void addLoginHistory(LoginHistory loginHistory) {
        loginHistoryList.add(loginHistory);
        loginHistory.setUserHistory(this);
    }
    

    @OneToMany(mappedBy = "referrer", cascade = CascadeType.ALL)
    private List<Referral> referrals = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Collection<Role> roles;

    public String getFullName() {
        return firstName != null ? firstName.concat(" ").concat(lastName) : "";
    }
}
