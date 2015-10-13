package org.jboss.da.communication.pnc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class BuildConfiguration extends BuildConfigurationCreate {

    @Getter
    @Setter
    private int id;
}
