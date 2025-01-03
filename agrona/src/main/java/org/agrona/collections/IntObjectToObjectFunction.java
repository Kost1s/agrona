/*
 * Copyright 2014-2025 Real Logic Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agrona.collections;

/**
 * This is an (int, Object) -&gt; Object primitive specialisation of a BiFunction.
 *
 * @param <T> the type of the input to the function.
 * @param <R> the type of the output to the function.
 */
@FunctionalInterface
public interface
    IntObjectToObjectFunction<T, R>
{
    /**
     * Applies this function to the given arguments.
     *
     * @param i the second function argument.
     * @param t the first function argument.
     * @return the function result.
     */
    R apply(int i, T t);
}
