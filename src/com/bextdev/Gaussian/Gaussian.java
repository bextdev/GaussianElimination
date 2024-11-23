/**
 * This extension is created by Bextdev at 11/23/2024.
 * 
 * The Gaussian class serves as the main entry point for solving systems of rankings of matrix.
 * using Gaussian Elimination within the MIT App Inventor environment.
 */

package com.bextdev.Gaussian;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class Gaussian extends AndroidNonvisibleComponent {
    private GaussianElimination gaussianElimination;

    public Gaussian(ComponentContainer container) {
        super(container.$form());
        gaussianElimination = new GaussianElimination();
    }

    @SimpleFunction
    public void Solve(double[][] A, double[] b) {
        if (A == null || b == null || A.length != b.length) {
            throw new IllegalArgumentException("Matrix A and vector b must be non-null and of compatible dimensions.");
        }
        gaussianElimination.solve(A, b);
    }

    @SimpleFunction
    public String Solution() {
        return gaussianElimination.getSolution();
    }
}
