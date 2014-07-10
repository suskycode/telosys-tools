/**
 *  Copyright (C) 2008-2014  Telosys project org. ( http://www.telosys.org/ )
 *
 *  Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.gnu.org/licenses/lgpl.html
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.telosys.tools.commons.github;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Utility class for GitHub
 * 
 * @author L. Guerin
 *
 */
public class GitHubUtil {

	public static void sortByName( List<GitHubRepository> list ) {
		Collections.sort(list, new Comparator<GitHubRepository>() {

			@Override
			public int compare(GitHubRepository repo1, GitHubRepository repo2) {
				String name1 = repo1.getName();
				String name2 = repo2.getName();
				return name1.compareTo(name2);
			}
			
		});
	}
}
