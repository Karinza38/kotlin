/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.swiftexport.standalone;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.native.swift.sir.GenerateSirTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/swift/swift-export-standalone/testData")
@TestDataPath("$PROJECT_ROOT")
public class SwiftExportRunnerTest extends AbstractSwiftRunnerTest {
  @Test
  public void testAllFilesPresentInTestData() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/swift/swift-export-standalone/testData"), Pattern.compile("^([^\\.]+)$"), null, false);
  }

  @Test
  @TestMetadata("classes")
  public void testClasses() {
    runTest("native/swift/swift-export-standalone/testData/classes/");
  }

  @Test
  @TestMetadata("documentation")
  public void testDocumentation() {
    runTest("native/swift/swift-export-standalone/testData/documentation/");
  }

  @Test
  @TestMetadata("functions")
  public void testFunctions() {
    runTest("native/swift/swift-export-standalone/testData/functions/");
  }

  @Test
  @TestMetadata("no_package")
  public void testNo_package() {
    runTest("native/swift/swift-export-standalone/testData/no_package/");
  }

  @Test
  @TestMetadata("type_reference")
  public void testType_reference() {
    runTest("native/swift/swift-export-standalone/testData/type_reference/");
  }

  @Test
  @TestMetadata("variables")
  public void testVariables() {
    runTest("native/swift/swift-export-standalone/testData/variables/");
  }
}
