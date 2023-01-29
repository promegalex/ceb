package com.ceb.robot.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseDto implements Serializable {
    private static final long serialVersionUID = 8491787687592324187L;

    private int id;

}
