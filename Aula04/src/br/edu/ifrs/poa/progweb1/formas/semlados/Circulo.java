/*
 * Copyright (C) 2019 jeronimo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.edu.ifrs.poa.progweb1.formas.semlados;

import static java.lang.Math.pow;

public class Circulo extends br.edu.ifrs.poa.progweb1.formas.Figura{
    
    public static final double PI = 3.1415;
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea(){
        double area = pow(PI * raio,2);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }

}
