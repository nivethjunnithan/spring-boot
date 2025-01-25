/*
 * Copyright 2012-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.docs.howto.traditionaldeployment.convertexistingapplication.both

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class MyApplication : SpringBootServletInitializer() {

	override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
		return customizerBuilder(builder)
	}

	companion object {

		@JvmStatic
		fun main(args: Array<String>) {
			customizerBuilder(SpringApplicationBuilder()).run(*args)
		}

		private fun customizerBuilder(builder: SpringApplicationBuilder): SpringApplicationBuilder {
			return builder.sources(MyApplication::class.java).bannerMode(Banner.Mode.OFF)
		}

	}

}
