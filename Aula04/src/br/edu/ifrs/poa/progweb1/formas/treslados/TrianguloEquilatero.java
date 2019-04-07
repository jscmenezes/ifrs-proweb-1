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
package br.edu.ifrs.poa.progweb1.formas.treslados;

public class TrianguloEquilatero extends br.edu.ifrs.poa.progweb1.formas.Figura{
    
    private double lado;

    public TrianguloEquilatero() {
    }

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calculaArea(){
        double area = (this.lado * this.lado)/2 ;
        return area;
    }

    @Override
    public String toString() {
        return "TrianguloEquilatero{" + "lado=" + lado + '}';
    }
            
}
