/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.inject;

import io.micronaut.core.type.Executable;

import java.lang.reflect.Method;

/**
 * Defines an injection point for a method.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface MethodInjectionPoint extends CallableInjectionPoint, Executable {

    /**
     * @return The setter to invoke to set said property
     */
    Method getMethod();

    /**
     * @return The method name
     */
    String getName();

    /**
     * @return Is this method a pre-destroy method
     */
    boolean isPreDestroyMethod();

    /**
     * @return Is this method a post construct method
     */
    boolean isPostConstructMethod();

    /**
     * Invokes the method.
     *
     * @param instance The instance
     * @param args     The arguments. Should match the types of getArguments()
     * @return The new value
     */
    Object invoke(Object instance, Object... args);
}
