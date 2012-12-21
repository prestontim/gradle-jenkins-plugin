package org.gradle.plugins.jenkins

import org.gradle.api.NamedDomainObjectCollection
import org.gradle.util.ConfigureUtil

class JenkinsConfigurationConvention {
	JenkinsConfiguration jenkins
	
	public JenkinsConfigurationConvention(JenkinsConfiguration jenkins) {
		this.jenkins = jenkins
	}
	
	def jenkins(closure) {
		ConfigureUtil.configure(closure, jenkins)
	}
	
	def branches(closure) {
		branches.configure(closure)
	}
}
