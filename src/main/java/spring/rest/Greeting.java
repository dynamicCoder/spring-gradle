// <editor-fold defaultstate="collapsed" desc="Copyright © 2016 Burning Glass International Inc.">
/*
 *******************************************************************************
 * Proprietary and Confidential
 *
 * All rights reserved. Burning
 * Glass Technologies DISCLAIMS ANY OTHER WARRANTIES, EXPRESS OR IMPLIED,
 * INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * *****************************************************************************
 */
// </editor-fold>
package spring.rest;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}