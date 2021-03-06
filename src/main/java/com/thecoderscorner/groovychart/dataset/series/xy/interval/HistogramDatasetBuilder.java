/*
 *
 * Copyright 2006 Sun Microsystems, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * HistogramDatasetBuilder.java
 *
 * Created on December 7, 2006, 3:14 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.thecoderscorner.groovychart.dataset.series.xy.interval;

import java.util.Map;
import com.thecoderscorner.groovychart.dataset.BaseDatasetBuilder;
import org.jfree.data.general.Dataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author jclarke
 */
public class HistogramDatasetBuilder extends BaseDatasetBuilder {
    
    /** Creates a new instance of HistogramDatasetBuilder */
    public HistogramDatasetBuilder() {
    }
    
    public Dataset getDataset() {
        return getHistogram();
    }    

    /**
     * Holds value of property histogram.
     */
    private HistogramDataset histogram;

    /**
     * Getter for property histogram.
     * @return Value of property histogram.
     */
    public HistogramDataset getHistogram() {
        return this.histogram;
    }

    /**
     * Setter for property histogram.
     * @param histogram New value of property histogram.
     */
    public void setHistogram(HistogramDataset histogram) {
        this.histogram = histogram;
    }

    public void processNode(Object name, Map map, Object value) throws Exception {
        if(value != null && value instanceof HistogramDataset) {
            this.histogram = (HistogramDataset)value;
        }else {
            // TODO
        }          
    }
    
}
