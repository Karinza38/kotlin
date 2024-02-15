/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.modules

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.FirSessionComponent
import org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver

class FirJavaModuleResolverProvider(val javaModuleResolver: JavaModuleResolver) : FirSessionComponent

val FirSession.javaModuleResolverProvider: FirJavaModuleResolverProvider by FirSession.sessionComponentAccessor()
