package com.local.snippet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
@ToString
public class Snippet {

    @Id
    @GeneratedValue
    @Column(name = "snippet_id", unique = true, nullable = false)
    Long snippetID;
    String abbreviation;
    String command;
}
