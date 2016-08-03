import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

def strategy = new ProjectMatrixAuthorizationStrategy()
strategy.add(Jenkins.ADMINISTER, "admin")
instance.setAuthorizationStrategy(strategy)

instance.setNumExecutors(0)

instance.save()

