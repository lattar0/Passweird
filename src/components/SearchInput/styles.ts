import { StyleSheet } from 'react-native';
import { theme } from '../../styles/themes';

export const styles = StyleSheet.create({
  container: { 
    width: 400,
    height: 60,

    flex: 1,
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    
    backgroundColor: theme.colors.blackBlue,

    borderRadius: 100,
    borderWidth: 2.5,
    borderColor: theme.colors.greenBlue,
  },

  textInput: {
    width: '84%',
    height: '100%',
    color: theme.colors.gray,
    fontFamily: theme.fonts.semiBold,
    marginLeft: 16,
  },

  icon: {
    width: '10%',
    height: 40,
    backgroundColor: theme.colors.darkBlue,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 100,
    marginRight: 6
  }
})