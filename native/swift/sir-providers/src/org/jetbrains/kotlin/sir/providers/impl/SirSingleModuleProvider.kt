/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.sir.providers.impl

import org.jetbrains.kotlin.analysis.project.structure.KtModule
import org.jetbrains.kotlin.sir.SirImport
import org.jetbrains.kotlin.sir.SirModule
import org.jetbrains.kotlin.sir.builder.buildModule
import org.jetbrains.kotlin.sir.providers.SirModuleProvider

/**
 * An implementation of [SirModuleProvider] that stores all declarations under a single module
 */
public class SirSingleModuleProvider(
    private val swiftModuleName: String,
    private val bridgeModuleName: String,
) : SirModuleProvider {

    private val theModule by lazy {
        buildModule {
            name = swiftModuleName
            // imports should be reworked - KT-66727
            imports += SirImport(bridgeModuleName)
        }
    }

    override fun KtModule.sirModule(): SirModule {
        return theModule
    }
}