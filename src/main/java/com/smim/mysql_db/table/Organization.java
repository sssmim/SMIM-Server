package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Organization {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long group_num;

    @Column(nullable = false)
    private String group_name;

    @Column(nullable = true)
    private String group_desc;

    @Column(nullable = false)
    private String group_category;

    @Column(nullable = true)
    private String group_image;

    @Column(nullable = true)
    private int view_count;

    @Column(nullable = true)
    private int authority;

    public Organization(OrganizationDto organizationDto) {
        this.group_name = organizationDto.getGroup_name();
        this.group_desc = organizationDto.getGroup_desc();
        this.group_category = organizationDto.getGroup_category();
        this.group_image = organizationDto.getGroup_image();
        this.view_count = organizationDto.getView_count();
        this.authority = organizationDto.getAuthority();
    }

    public void update(OrganizationDto organizationDto) {
        this.group_name = organizationDto.getGroup_name();
        this.group_desc = organizationDto.getGroup_desc();
        this.group_category = organizationDto.getGroup_category();
        this.group_image = organizationDto.getGroup_image();
        this.view_count = organizationDto.getView_count();
        this.authority = organizationDto.getAuthority();
    }
}
