grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
	}

	plugins {

		runtime ":asset-pipeline:0.1.9"
		compile ":handlebars-asset-pipeline:1.0.0-RC4"

		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}